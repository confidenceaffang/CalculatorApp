package src;

public class AdvanceCalc extends MemoryCalc implements AdvanceMath{


    private int precision = 1;

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public void sqrt(){
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }
    public <N extends Number> void pow(N value){
        operator = '\u005E';
        previousValue = CurrentValue;
        inputValue =0.0;
        currentValue = Math.pow(inputValue, currentValue);
        updateDisplay();
    }

}

