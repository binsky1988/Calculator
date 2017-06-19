package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends Activity {
	EditText edit_text;    //计算器显示框
	
	Button back_button;    //退格
	Button reset_button;   //清除
	Button seven_button;   //7
	Button eight_button;   //8
	Button nine_button;    //9
	Button division_button;   //除法
	Button four_button;     //4
	Button five_button;     //5
	Button six_button;      //6
	Button multiplication_button;    //乘法
	Button one_button;    //1
	Button two_button;    //2
	Button three_button;  //3
	Button subtraction_button;    //减法
	Button point_button;     //小数点
	Button zero_button;     //0
	Button equal_button;    //等于
	Button addition_button;    //加法
	
	OnClickListener back_button_listener;     //按钮对应的触发事件
	OnClickListener reset_button_listener;
	OnClickListener seven_button_listener;
	OnClickListener eight_button_listener;
	OnClickListener nine_button_listener;
	OnClickListener division_button_listener;
	OnClickListener four_button_listener;
	OnClickListener five_button_listener;
	OnClickListener six_button_listener;
	OnClickListener multiplication_button_listener;
	OnClickListener one_button_listener;
	OnClickListener two_button_listener;
	OnClickListener three_button_listener;
	OnClickListener subtraction_button_listener;
	OnClickListener point_button_listener;
	OnClickListener zero_button_listener;
	OnClickListener equal_button_listener;
	OnClickListener addition_button_listener;
	
	int addition_flag=0;    //标记加法运算
	int subtraction_flag=0;  //标记减法运算
	int multiplication_flag=0;   //标记乘法运算
	int division_flag=0;     //标记除法运算
	
	double first_number;   //表示进行运算的第一个数
	double second_number;  //表示进行运算的第二个数
	double result;     //表示运算结果

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("计算器");
		setContentView(R.layout.activity_main);
		
		zero_button_listener=new OnClickListener(){    //0按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				
				if (edit_text.getText().toString().compareTo("0")!=0){  //排除"00"情况
					CharSequence edit_text_value=edit_text.getText();
					edit_text.setText(edit_text_value+"0");
				}
			}
		};
		
		one_button_listener=new OnClickListener(){    //1按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)    //排除"01"情况
					edit_text.setText("1");
				
				else
					edit_text.setText(edit_text_string+"1");
			}
		};
		
		two_button_listener=new OnClickListener(){   //2按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)     //排除"02"情况
					edit_text.setText("2");
				
				else
					edit_text.setText(edit_text_string+"2");
			}
		};
		
		three_button_listener=new OnClickListener(){   //3按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)   //排除"03"情况
					edit_text.setText("3");
				
				else
					edit_text.setText(edit_text_string+"3");
			}
		};
		
		four_button_listener=new OnClickListener(){    //4按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)   //排除"04"情况
					edit_text.setText("4");
				
				else
					edit_text.setText(edit_text_string+"4");
			}
		};
		
		five_button_listener=new OnClickListener(){   //5按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)    //排除"05"情况
					edit_text.setText("5");
				
				else
					edit_text.setText(edit_text_string+"5");
			}
		};
		
		six_button_listener=new OnClickListener(){   //6按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)    //排除"06"情况
					edit_text.setText("6");
				
				else
					edit_text.setText(edit_text_string+"6");
			}
		};
		
		seven_button_listener=new OnClickListener(){   //7按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)   //排除"07"情况
					edit_text.setText("7");
				
				else
					edit_text.setText(edit_text_string+"7");
			}
		};
		
		eight_button_listener=new OnClickListener(){    //8按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)   //排除"08"情况
					edit_text.setText("8");
				
				else
					edit_text.setText(edit_text_string+"8");
			}
		};
		
		nine_button_listener=new OnClickListener(){    //9按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.compareTo("0")==0)    //排除"09"情况
					edit_text.setText("9");
				
				else
					edit_text.setText(edit_text_string+"9");
			}
		};
		
		back_button_listener=new OnClickListener(){    //退格按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.length()!=0){    //当有内容时执行退格操作
					if (edit_text_string.compareTo("Infinity")!=0){
						String edit_text_string_delete=edit_text_string.substring(0, edit_text_string.length()-1);
						edit_text.setText(edit_text_string_delete);
					}
					
					else    //当结果出现无穷大时按下退格直接清空
						edit_text.setText("");
				}
			}
		};
		
		reset_button_listener=new OnClickListener(){   //清除按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				edit_text.setText("");   //直接清空
			}
		};
		
		point_button_listener=new OnClickListener(){   //小数点按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				if (edit_text_string.contains(".")==false)   //当前数值包含小数点时不能再添加小数点
					edit_text.setText(edit_text_string+".");
			}
		};
		
		addition_button_listener=new OnClickListener(){  //加法按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				first_number=Double.parseDouble(edit_text_string);   //得到加法运算第一个数
				
				edit_text.setText("");   //当前数值清空
				
				addition_flag=1;     //标记加法运算
				subtraction_flag=0;
				multiplication_flag=0;
				division_flag=0;
			}
		};
		
		subtraction_button_listener=new OnClickListener(){    //减法按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				first_number=Double.parseDouble(edit_text_string);   //得到减法运算第一个数
				
				edit_text.setText("");   //当前数值清空
				
				addition_flag=0;
				subtraction_flag=1;    //标记减法运算
				multiplication_flag=0;
				division_flag=0;
			}
		};
		
		multiplication_button_listener=new OnClickListener(){   //乘法按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				first_number=Double.parseDouble(edit_text_string);   //得到乘法运算第一个数
				
				edit_text.setText("");   //当前数值清空
				
				addition_flag=0;
				subtraction_flag=0;
				multiplication_flag=1;    //标记乘法运算
				division_flag=0;
			}
		};
		
		division_button_listener=new OnClickListener(){    //除法按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				first_number=Double.parseDouble(edit_text_string);  //得到除法运算第一个数
				
				edit_text.setText("");    //当前数值清空
				
				addition_flag=0;
				subtraction_flag=0;
				multiplication_flag=0;
				division_flag=1;     //标记除法运算
			}
		};
		
		equal_button_listener=new OnClickListener(){   //等号按钮触发
			public void onClick(View v){
				edit_text=(EditText)findViewById(R.id.edit_text);
				String edit_text_string=edit_text.getText().toString();
				
				second_number=Double.parseDouble(edit_text_string);   //得到运算的第二个数
				
				if (addition_flag==1){    //进行加法运算
					result=first_number+second_number;
					
					String result_string=Double.toString(result);
					edit_text.setText(result_string);
				}
				
				else if (subtraction_flag==1){   //进行减法运算
					result=first_number-second_number;
					
					String result_string=Double.toString(result);
					edit_text.setText(result_string);
				}
				
				else if (multiplication_flag==1){   //进行乘法运算
					result=first_number*second_number;
					
					String result_string=Double.toString(result);
					edit_text.setText(result_string);
				}
				
				else if (division_flag==1){    //进行除法运算
					result=first_number/second_number;
					
					String result_string=Double.toString(result);
					edit_text.setText(result_string);
				}
				
				addition_flag=0;   //清空标记
				subtraction_flag=0;
				multiplication_flag=0;
				division_flag=0;
			}
		};
		
		zero_button=(Button)findViewById(R.id.zero_button);      //将按钮和触发事件相关联
		zero_button.setOnClickListener(zero_button_listener);
		
		one_button=(Button)findViewById(R.id.one_button);
		one_button.setOnClickListener(one_button_listener);
		
		two_button=(Button)findViewById(R.id.two_button);
		two_button.setOnClickListener(two_button_listener);
		
		three_button=(Button)findViewById(R.id.three_button);
		three_button.setOnClickListener(three_button_listener);
		
		four_button=(Button)findViewById(R.id.four_button);
		four_button.setOnClickListener(four_button_listener);
		
		five_button=(Button)findViewById(R.id.five_button);
		five_button.setOnClickListener(five_button_listener);
		
		six_button=(Button)findViewById(R.id.six_button);
		six_button.setOnClickListener(six_button_listener);	
		
		seven_button=(Button)findViewById(R.id.seven_button);
		seven_button.setOnClickListener(seven_button_listener);	
		
		eight_button=(Button)findViewById(R.id.eight_button);
		eight_button.setOnClickListener(eight_button_listener);
		
		nine_button=(Button)findViewById(R.id.nine_button);
		nine_button.setOnClickListener(nine_button_listener);
		
		reset_button=(Button)findViewById(R.id.reset_button);
		reset_button.setOnClickListener(reset_button_listener);
		
		back_button=(Button)findViewById(R.id.back_button);
		back_button.setOnClickListener(back_button_listener);
		
		point_button=(Button)findViewById(R.id.point_button);
		point_button.setOnClickListener(point_button_listener);
		
		addition_button=(Button)findViewById(R.id.addition_button);
		addition_button.setOnClickListener(addition_button_listener);
		
		subtraction_button=(Button)findViewById(R.id.subtraction_button);
		subtraction_button.setOnClickListener(subtraction_button_listener);
		
		multiplication_button=(Button)findViewById(R.id.multiplication_button);
		multiplication_button.setOnClickListener(multiplication_button_listener);
		
		division_button=(Button)findViewById(R.id.division_button);
		division_button.setOnClickListener(division_button_listener);
		
		equal_button=(Button)findViewById(R.id.equal_button);
		equal_button.setOnClickListener(equal_button_listener);
	}
}
