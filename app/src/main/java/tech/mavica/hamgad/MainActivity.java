package tech.mavica.hamgad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView value1TextView;
    TextView value2TextView;
    TextView operationTextView;
    TextView resultTextView;
    String value1InString,value2InString,operation,resultInString;
    double value1InDouble=0,value2InDouble=0,resultInDouble=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       value1TextView=(TextView) findViewById(R.id.value1);
         value2TextView=(TextView)findViewById(R.id.value2);
         operationTextView=(TextView)findViewById(R.id.operation);
         resultTextView=(TextView)findViewById(R.id.result);
    }


    /*
     *
     * * * * * * * * * * * * * * * * Numbers Section * * * * * * * * * * * * * * * * * *
     *
     */


    public  void btn1Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"1");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"1");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"1");
        }
    }
    public  void btn2Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"2");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"2");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"2");
        }
    }
    public  void btn3Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"3");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"3");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"3");
        }
    }
    public  void btn4Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"4");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"4");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"4");
        }
    }
    public  void btn5Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"5");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"5");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"5");
        }
    }
    public  void btn6Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"6");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"6");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"6");
        }
    }
    public  void btn7Clicked(View view){
        System.out.println("Button 7 Clicked #");
if(value1TextView.getText()==""){    // check if the first field is empty
    value1TextView.setText(value1TextView.getText()+"7");
}else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
    value1TextView.setText(value1TextView.getText()+"7");
}else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
    value2TextView.setText(value2TextView.getText()+"7");
}
    }
    public  void btn8Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"8");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"8");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"8");
        }
    }
    public  void btn9Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"9");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"9");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"9");
        }
    }
    public  void btn0Clicked(View view){
        if(value1TextView.getText()==""){    // check if the first field is empty
            value1TextView.setText(value1TextView.getText()+"0");
        }else if(operationTextView.getText()==""){ // see if the number will be add in the first field or in the second field
            value1TextView.setText(value1TextView.getText()+"0");
        }else{ // if you reach for this statement so the equation will be like 5+ .. mean that the number will be add in the second field
            value2TextView.setText(value2TextView.getText()+"0");
        }
    }
    /*
    *
    * * * * * * * * * * * * * * * * Operations Section * * * * * * * * * * * * * * * * * *
    *
     */

    public void addButtonClicked(View view){
        {
            if(value1TextView.getText()==""){ // see if the first value is entered or not
                Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
            }
            else if(value1TextView.getText()!=""&&operationTextView.getText()==""){ // if the first value is put but the operation not specified
                operationTextView.setText("+");
                operation = "+";
            }
            else if(value1TextView.getText()!=""&&operationTextView.getText()!=""&&value2TextView.getText()==""){
                operationTextView.setText("+");
                operation="+";
            }
            else if(operationTextView.getText()!=""&&value2TextView.getText()!=""){
                if(operation=="+"){
                    value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                    value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                    value1InDouble += value2InDouble;
                    value2InDouble=0;
                    value2TextView.setText("");
                    value1TextView.setText(value1InDouble+"");
                    operationTextView.setText("+");
                    operation="+";
                }else if(operation=="-"){
                    value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                    value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                    value1InDouble -= value2InDouble;
                    value2InDouble=0;
                    value2TextView.setText("");
                    value1TextView.setText(value1InDouble+"");
                    operationTextView.setText("+");
                    operation="+";
                }else if(operation=="x"){
                    value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                    value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                    value1InDouble *= value2InDouble;
                    value2InDouble=0;
                    value2TextView.setText("");
                    value1TextView.setText(value1InDouble+"");
                    operationTextView.setText("+");
                    operation="+";
                }else if(operation=="/"){
                    value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                    value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                    value1InDouble /= value2InDouble;
                    value2InDouble=0;
                    value2TextView.setText("");
                    value1TextView.setText(value1InDouble+"");
                    operationTextView.setText("+");
                    operation="+";
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void minusButtonClicked(View view){
        if(value1TextView.getText()==""){ // see if the first value is entered or not
          value1TextView.setText("-");  }
        else if(value1TextView.getText()!=""&&operationTextView.getText()==""){ // if the first value is put but the operation not specified
            operationTextView.setText("-");
            operation = "-";
        }
        else if(value1TextView.getText()!=""&&operationTextView.getText()!=""&&value2TextView.getText()==""){
            operationTextView.setText("-");
            operation="-";
        }
        else if(operationTextView.getText()!=""&&value2TextView.getText()!=""){
            if(operation=="+"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble += value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("-");
                operation="-";
            }else if(operation=="-"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble -= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("-");
                operation="-";
            }else if(operation=="x"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble *= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("-");
                operation="-";
            }else if(operation=="/"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble /= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("-");
                operation="-";
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
        }
    }


    public void multiplyButtonClicked(View view){
        if(value1TextView.getText()==""){ // see if the first value is entered or not
            Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
        }
        else if(value1TextView.getText()!=""&&operationTextView.getText()==""){ // if the first value is put but the operation not specified
            operationTextView.setText("x");
            operation = "x";
        }
        else if(value1TextView.getText()!=""&&operationTextView.getText()!=""&&value2TextView.getText()==""){
            operationTextView.setText("x");
            operation="x";
        }
        else if(operationTextView.getText()!=""&&value2TextView.getText()!=""){
            if(operation=="+"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble += value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("x");
                operation="x";
            }else if(operation=="-"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble -= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("x");
                operation="x";
            }else if(operation=="x"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble *= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("x");
                operation="x";
            }else if(operation=="/"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble /= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("x");
                operation="x";
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
        }
    }


    public void divideButtonClicked(View view){
        if(value1TextView.getText()==""){ // see if the first value is entered or not
            Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
        }
        else if(value1TextView.getText()!=""&&operationTextView.getText()==""){ // if the first value is put but the operation not specified
            operationTextView.setText("/");
            operation = "/";
        }
        else if(value1TextView.getText()!=""&&operationTextView.getText()!=""&&value2TextView.getText()==""){
            operationTextView.setText("/");
            operation="/";
        }
        else if(operationTextView.getText()!=""&&value2TextView.getText()!=""){
            if(operation=="+"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble += value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("/");
                operation="/";
            }else if(operation=="-"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble -= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("/");
                operation="/";
            }else if(operation=="x"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble *= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("/");
                operation="/";
            }else if(operation=="/"){
                value1InDouble=Double.parseDouble(value1TextView.getText()+"");
                value2InDouble=Double.parseDouble(value2TextView.getText()+"");
                value1InDouble /= value2InDouble;
                value2InDouble=0;
                value2TextView.setText("");
                value1TextView.setText(value1InDouble+"");
                operationTextView.setText("/");
                operation="/";
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "you must enter the first value !!", Toast.LENGTH_SHORT).show();
        }
    }


    public  void acButtonClicked(View view){
        value1TextView.setText("");
        value2TextView.setText("");
        resultTextView.setText("");
        operationTextView.setText("");
        value1InDouble=0;
        value2InDouble=0;
        resultInDouble=0;
    }

    public void equalButtonClicked(View view) {
        if (value1TextView.getText() == "" || value2TextView.getText() == "" || operationTextView.getText() == "") {
            Toast.makeText(getApplicationContext(), "there is empty Field !! ", Toast.LENGTH_SHORT).show();
        } else {
            value1InDouble=Double.parseDouble(value1TextView.getText()+"");
            value2InDouble=Double.parseDouble(value2TextView.getText()+"");
           if (operation == "+") {
                resultInDouble = value1InDouble + value2InDouble;
                resultTextView.setText(resultInDouble + "");
            }
            if (operation == "x") {
                resultInDouble = value1InDouble * value2InDouble;
                resultTextView.setText(resultInDouble + "");
            }
            if (operation == "-") {
                resultInDouble = value1InDouble - value2InDouble;
                resultTextView.setText(resultInDouble + "");
            }
            if (operation == "/") {
                resultInDouble = value1InDouble / value2InDouble;
                resultTextView.setText(resultInDouble + "");
            }
        }
    }
}