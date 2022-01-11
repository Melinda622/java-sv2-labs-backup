package defaultconstructor.date;

public class SimpleDateFormatter {

    CountryCode countrycode;

    public SimpleDateFormatter(){

        this.countrycode=CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate){
       return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+ simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        if(countryCode.equals(CountryCode.EN)){
            return simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+ simpleDate.getYear();
        }

        if(countryCode.equals(CountryCode.US)){
            return simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+ simpleDate.getYear();
        }

        if(countryCode.equals(CountryCode.HU)){
            return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+ simpleDate.getDay();
        }
        return formatDateString(simpleDate);
    }
}
