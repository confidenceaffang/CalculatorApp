package src;

public interface BasicMath {
    <N extends Number> void add(N value );
    <N extends Number> void subtract(N value );
    <N extends Number> void multiply(N value );
    <N extends Number> void divide(N value );
}
