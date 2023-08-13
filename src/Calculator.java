public class Calculator {

    private final String currencyFrom;
    private String initialAmount;
    private String currencyInto;

    public Calculator(String currencyFrom, String initialAmount, String currencyInto){
        this.currencyFrom=currencyFrom;
        this.initialAmount=initialAmount;
        this.currencyInto=currencyInto;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getCurrencyInto() {
        return currencyInto;
    }

    public void setCurrencyInto(String currencyInto) {
        this.currencyInto = currencyInto;
    }

    public int calculate(){
        int calculatedSum;
        if(currencyFrom.contains("RON") && currencyInto.contains("EUR")){
            calculatedSum=Integer.parseInt(initialAmount)/5;
        }
        else{
            calculatedSum=0;
        }
        System.out.println("You converted " + initialAmount + " " + currencyFrom +" into " + currencyInto +
                " and you got back "+ calculatedSum + " " + currencyInto);
        return calculatedSum;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "currencyFrom='" + currencyFrom + '\'' +
                ", initialAmount='" + initialAmount + '\'' +
                ", currencyInto='" + currencyInto + '\'' +
                '}';
    }
}
