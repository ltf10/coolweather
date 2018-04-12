package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by L on 2018/4/11.
 */

public class Weather {


    private List<HeWeatherBean> HeWeather;

    public List<HeWeatherBean> getHeWeather() {
        return HeWeather;
    }

    public void setHeWeather(List<HeWeatherBean> HeWeather) {
        this.HeWeather = HeWeather;
    }

    public static class HeWeatherBean {
        /**
         * basic : {"cid":"CN101010100","location":"北京","parent_city":"北京","admin_area":"北京","cnty":"中国","lat":"39.90498734","lon":"116.4052887","tz":"+8.00","city":"北京","id":"CN101010100","update":{"loc":"2018-04-11 12:47","utc":"2018-04-11 04:47"}}
         * status : ok
         * now : {"cloud":"0","cond_code":"100","cond_txt":"晴","fl":"11","hum":"17","pcpn":"0.0","pres":"1011","tmp":"23","vis":"10","wind_deg":"281","wind_dir":"西风","wind_sc":"3","wind_spd":"17","cond":{"code":"100","txt":"晴"}}
         * daily_forecast : [{"date":"2018-04-11","cond":{"txt_d":"晴"},"tmp":{"max":"24","min":"9"}},{"date":"2018-04-12","cond":{"txt_d":"多云"},"tmp":{"max":"21","min":"9"}},{"date":"2018-04-13","cond":{"txt_d":"小雨"},"tmp":{"max":"13","min":"6"}}]
         * aqi : {"city":{"aqi":"33","pm25":"19","qlty":"优"}}
         * suggestion : {"comf":{"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。","type":"comf"},"sport":{"brf":"适宜","txt":"天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。","type":"sport"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","type":"cw"}}
         */

        private BasicBean basic;
        private String status;
        private NowBean now;
        private AqiBean aqi;
        private SuggestionBean suggestion;
        private List<DailyForecastBean> daily_forecast;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public static class BasicBean {
            /**
             * city : 北京
             * id : CN101010100
             * update : {"loc":"2018-04-11 12:47","utc":"2018-04-11 04:47"}
             */
            @SerializedName("city")
            private String cityName;
            @SerializedName("id")
            private String weatherId;
            private UpdateBean update;

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String city) {
                this.cityName = city;
            }

            public String getWeatherId() {
                return weatherId;
            }

            public void setWeatherId(String id) {
                this.weatherId = id;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                /**
                 * loc : 2018-04-11 12:47
                 */
                @SerializedName("loc")
                private String updateTime;

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String loc) {
                    this.updateTime = loc;
                }
            }
        }

        public static class NowBean {
            /**
             * tmp : 23
             * cond : {"code":"100","txt":"晴"}
             */
            @SerializedName("tmp")
            private String tempperature;
            @SerializedName("cond")
            private MoreBean more;

            public String getTempperature() {
                return tempperature;
            }

            public void setTempperature(String tmp) {
                this.tempperature = tmp;
            }

            public MoreBean getMore() {
                return more;
            }

            public void setCond(MoreBean more) {
                this.more = more;
            }

            public static class MoreBean {
                /**
                 * txt : 晴
                 */
                @SerializedName("txt")
                private String info;

                public String getInfo() {
                    return info;
                }

                public void setInfo(String txt) {
                    this.info = txt;
                }
            }
        }

        public static class AqiBean {
            /**
             * city : {"aqi":"33","pm25":"19","qlty":"优"}
             */

            private AQICity city;

            public AQICity getCity() {
                return city;
            }

            public void setCity(AQICity city) {
                this.city = city;
            }

            public static class AQICity {
                /**
                 * aqi : 33
                 * pm25 : 19
                 */

                private String aqi;
                private String pm25;

                public String getAqi() {
                    return aqi;
                }

                public void setAqi(String aqi) {
                    this.aqi = aqi;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }
            }
        }

        public static class SuggestionBean {
            /**
             * comf : {"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。","type":"comf"}
             * sport : {"brf":"适宜","txt":"天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。","type":"sport"}
             * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","type":"cw"}
             */
            @SerializedName("comf")
            private ComfBean comfort;
            private SportBean sport;
            @SerializedName("cw")
            private CarWashBean carWash;

            public ComfBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfBean comf) {
                this.comfort = comf;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public CarWashBean getCarWash() {
                return carWash;
            }

            public void setCarWash(CarWashBean cw) {
                this.carWash = cw;
            }

            public static class ComfBean {
                /**
                 * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
                 */
                @SerializedName("txt")
                private String info;

                public String getInfo() {
                    return info;
                }

                public void setInfo(String txt) {
                    this.info = txt;
                }
            }

            public static class SportBean {
                /**
                 * brf : 适宜
                 * txt : 天气较好，赶快投身大自然参与户外运动，尽情感受运动的快乐吧。
                 * type : sport
                 */
                @SerializedName("txt")
                private String info;

                public String getInfo() {
                    return info;
                }

                public void setInfo(String txt) {
                    this.info = txt;
                }
            }

            public static class CarWashBean {
                /**
                 * brf : 较适宜
                 * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
                 * type : cw
                 */
                @SerializedName("txt")
                private String info;

                public String getInfo() {
                    return info;
                }

                public void setTxt(String txt) {
                    this.info = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * date : 2018-04-11
             * cond : {"txt_d":"晴"}
             * tmp : {"max":"24","min":"9"}
             */

            private String date;
            @SerializedName("cond")
            private CondBeanX more;
            @SerializedName("tmp")
            private TemperatureBean temperature;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public CondBeanX getMore() {
                return more;
            }

            public void setMore(CondBeanX cond) {
                this.more = cond;
            }

            public TemperatureBean getTemperature() {
                return temperature;
            }

            public void setTemperature(TemperatureBean tmp) {
                this.temperature = tmp;
            }

            public static class CondBeanX {
                /**
                 * txt_d : 晴
                 */
                @SerializedName("txt_d")
                private String info;

                public String getInfo() {
                    return info;
                }

                public void setInfo(String txt) {
                    this.info = txt;
                }
            }

            public static class TemperatureBean {
                /**
                 * max : 24
                 * min : 9
                 */

                private String max;
                private String min;

                public String getMax() {
                    return max;
                }

                public void setMax(String max) {
                    this.max = max;
                }

                public String getMin() {
                    return min;
                }

                public void setMin(String min) {
                    this.min = min;
                }
            }
        }
    }
}
