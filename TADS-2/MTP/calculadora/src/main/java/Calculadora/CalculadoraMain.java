/*
 * @author CarlosNeto
 */
package Calculadora;
public class CalculadoraMain {
    public static void main(String args[]){
        CalculadoraFrame cf = new CalculadoraFrame();   
    }
    private Double num1;
    private Double num2;
    private Double num;
    double f = 1;
    // Setters
    public void setNum1(Double num1){
        this.num1 = num1;
    }
    public void setNum2(Double num2){
        this.num2 = num2;
    }
    public void setNum(Double num){
        this.num = num;
    }
    // Getters
    public Double getSum(){
        return(num1+num2);
    }
    public Double getSub(){
        return(num1-num2);
    }
    public Double getMul(){
        return(num1*num2);
    }
    public Double getDiv(){
        return(num1/num2);
    }
    public Double getPot(){
        return(Math.pow(num1, num2));
    }
    public Double getSqrt(){
        return(Math.sqrt(num));
    }
    public Double getCbrt(){
        return(Math.cbrt(num));
    }
    public Double getFat(){
        while(num > 1){
        f *= num;
        num -= 1;
        }
        return(f);
    }
}

