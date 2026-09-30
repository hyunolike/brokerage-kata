package kata.p5.legacy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 수수료 계산 서비스
 *
 * 최초작성 2019.03
 * 2020.11 VIP 추가
 * 2021.06 해외주식 추가
 * 2022.02 신규가입 이벤트 추가
 * 2023.08 API 채널 추가
 *
 * !!! 수정시 정산팀 확인 필수 !!!
 */
public class FeeService {

    public static double lastFee = 0; // 디버깅용 (삭제하지 말것)

    // mkt: KR/US, grd: NORMAL/VIP/EMP, ch: MTS/HTS/API/BRANCH, sd: B/S, joinDt: yyyyMMdd
    public double calc(String mkt, String grd, String ch, String sd, double prc, int qty, String joinDt, boolean evt) {
        double fee = 0;
        double amt = prc * qty;
        if (qty <= 0) {
            return 0;
        }
        if (mkt == null) return -1;
        if (mkt.equals("KR")) {
            if (grd == null || grd.equals("NORMAL")) {
                if (ch.equals("MTS")) {
                    fee = amt * 0.00015;
                    if (evt) {
                        // 신규가입 이벤트 : 가입 90일 이내 MTS 수수료 무료
                        try {
                            Date j = new SimpleDateFormat("yyyyMMdd").parse(joinDt);
                            long diff = (new Date().getTime() - j.getTime()) / (1000 * 60 * 60 * 24);
                            if (diff <= 90) {
                                fee = 0;
                            }
                        } catch (Exception e) {
                            // 무시
                        }
                    }
                } else if (ch.equals("HTS")) {
                    fee = amt * 0.00015;
                } else if (ch.equals("API")) {
                    fee = amt * 0.0001;
                } else {
                    fee = amt * 0.005;
                    if (fee < 1000) {
                        fee = 1000; // 지점 최소수수료
                    }
                }
                fee = Math.floor(fee);
            } else if (grd.equals("VIP")) {
                if (ch.equals("MTS")) {
                    fee = amt * 0.00015 * 0.5;
                    if (evt) {
                        // 신규가입 이벤트 : 가입 90일 이내 MTS 수수료 무료
                        try {
                            Date j = new SimpleDateFormat("yyyyMMdd").parse(joinDt);
                            long diff = (new Date().getTime() - j.getTime()) / (1000 * 60 * 60 * 24);
                            if (diff < 90) {
                                fee = 0;
                            }
                        } catch (Exception e) {
                            // 무시
                        }
                    }
                } else if (ch.equals("HTS")) {
                    fee = amt * 0.00015 * 0.5;
                } else if (ch.equals("API")) {
                    fee = amt * 0.0001 * 0.5;
                } else {
                    fee = amt * 0.005 * 0.5;
                    if (fee < 1000) {
                        fee = 1000; // 지점 최소수수료
                    }
                }
                fee = Math.round(fee);
            } else if (grd.equals("EMP")) {
                fee = 0; // 임직원 무료
            } else {
                return -1;
            }
            if (sd.equals("S")) {
                fee = fee + Math.floor(amt * 0.0018); // 거래세
            }
        } else if (mkt.equals("US")) {
            if (grd == null || grd.equals("NORMAL")) {
                if (ch.equals("BRANCH")) {
                    fee = amt * 0.005;
                } else {
                    fee = amt * 0.0025;
                }
                if (fee < 0.01) {
                    fee = 0.01;
                }
                fee = Math.round(fee * 100) / 100.0;
            } else if (grd.equals("VIP")) {
                if (ch.equals("BRANCH")) {
                    fee = amt * 0.005 * 0.8;
                } else {
                    fee = amt * 0.002;
                }
                fee = (int) (fee * 100) / 100.0;
            } else if (grd.equals("EMP")) {
                fee = amt * 0.001;
                fee = Math.round(fee * 100) / 100.0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        lastFee = fee;
        return fee;
    }
}
