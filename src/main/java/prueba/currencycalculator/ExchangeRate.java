package prueba.currencycalculator;

/**
 *
 * @author G10
 */
public class ExchangeRate {
    private final double rate;
    private final Currency currencyFrom;
    private final Currency currencyTo;X

    public ExchangeRate(double rate, Currency currencyFrom, Currency currencyTo) {
        this.rate = rate;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }
    
    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }
    
    public double convert(double from) {
        return from * rate;
    }
}
