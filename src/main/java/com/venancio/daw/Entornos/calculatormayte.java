package com.venancio.daw.Entornos;


public class calculatormayte { 

private int num1; 

private int num2; 

 

public calculatormayte(int a, int b) { 

num1 = a; 

num2 = b; 

} 

 

public int suma () { 

int result = num1 + num2; 

return result; 

} 

public int resta() { 

int result = num1 - num2; 

return result; 

} 

 

public int multiplicacion () { 

int result = num1 * num2; 

return result; 

} 

public int division () { 

int result = num1 / num2; 

return result; 

} 

} 