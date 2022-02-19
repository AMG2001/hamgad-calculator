package tech.mavica.hamgad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
       value1TextView=findViewById(R.id.value1);
         value2TextView=findViewById(R.id.value2);
         operationTextView=findViewById(R.id.operation);
         resultTextView=findViewById(R.id.result);
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

    /*
    *
    * * * * * * * * * * * * * * * * Operations Section * * * * * * * * * * * * * * * * * *
    *
     */

    public void addButtonClicked(View view){
        operationTextView.setText("+");
    }
    public void minusButtonClicked(View view){
        operationTextView.setText("-");
    }
    public void multiplyButtonClicked(View view){
        operationTextView.setText("x");
    }
    public void divideButtonClicked(View view){
        operationTextView.setText("/");
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
}