package com.jumpstart.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.jumpstart.R;
//import com.paypal.android.MEP.PayPal;
//import com.paypal.android.MEP.PayPalActivity;
//import com.paypal.android.MEP.PayPalAdvancedPayment;
//import com.paypal.android.MEP.PayPalReceiverDetails;

/**
 * Created by junvir on 5/6/2016.
 */
public class Advertisements extends Fragment{


    public final int PAYPAL_RESPONSE = 100;
    EditText editText_friend1_id;
    EditText editText_friend1_amount;
    EditText editText_friend2_id;
    EditText editText_friend2_amount;


    public static Advertisements newInstance() {
    return new Advertisements();



}    @Override
public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.  layout.activity_ad, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        editText_friend1_id= (EditText) view.findViewById(R.id.editText_friend1_id);
        editText_friend1_amount= (EditText) view.findViewById(R.id.editText_friend1_amount);
        editText_friend2_id= (EditText) view.findViewById(R.id.editText_friend2_id);
        editText_friend2_amount= (EditText) view.findViewById(R.id.editText_friend2_amount);

        Button paypal_button = (Button) view.findViewById(R.id.paypal_button);

//        initLibrary();
        paypal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // pay integration here

                PayPalButtonClick(editText_friend1_id.getText().toString(), editText_friend1_amount.getText().toString(), editText_friend2_id.getText().toString(),
                        editText_friend2_amount.getText().toString());

            }
        });



    }

//    public void initLibrary() {
//        PayPal pp = PayPal.getInstance();
//        if (pp == null) {
//
//            pp = PayPal.initWithAppID(this, Util.sand_box_id,
//                    PayPal.ENV_SANDBOX);
//
//        }
//    }


    public void PayPalButtonClick(String primary_id, String primary_amount,
                                  String secoundry_id, String secoundry_amount) {
        // Create a basic PayPal payment

        // PayPalPayment newPayment = new PayPalPayment();
        // newPayment.setSubtotal(new BigDecimal("1.0"));
        // newPayment.setCurrencyType("USD");
        // newPayment.setRecipient("npavankumar34@gmail.com");
        // newPayment.setMerchantName("My Company");
        // Log.d("pavan", "calling intent");
        // if( PayPal.getInstance()!=null){
        // Log.d("pavan", "in if");
        // Intent paypalIntent = PayPal.getInstance().checkout(newPayment,
        // this);
        // startActivityForResult(paypalIntent, 1);
        //

//        Log.d("pavan", "primary " + primary_id);
//        Log.d("pavan", "primary_amount " + primary_amount);
//
//        Log.d("pavan", "secoundry_amount " + secoundry_amount);
//        Log.d("pavan", "secoundry_id " + secoundry_id);
//
//        // config reciever1
//        PayPalReceiverDetails receiver0, receiver1;
//        receiver0 = new PayPalReceiverDetails();
//        receiver0.setRecipient(primary_id);
//        receiver0.setSubtotal(new BigDecimal(primary_amount));
//
//        // config reciever2
//        receiver1 = new PayPalReceiverDetails();
//        receiver1.setRecipient(secoundry_id);
//        receiver1.setSubtotal(new BigDecimal(secoundry_amount));
//
//        // adding payment type
//        PayPalAdvancedPayment advPayment = new PayPalAdvancedPayment();
//        advPayment.setCurrencyType("USD");
//
//
//
//        advPayment.getReceivers().add(receiver0);
//        advPayment.getReceivers().add(receiver1);
//        Intent paypalIntent = PayPal.getInstance().checkout(advPayment, this);
//        this.startActivityForResult(paypalIntent, PAYPAL_RESPONSE);

    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

//        Log.d("pavan", "response");
//
//        if (requestCode == PAYPAL_RESPONSE) {
//
//            switch(resultCode) {
//                case Activity.RESULT_OK:
//                    //The payment succeeded
//                    String payKey =
//                            data.getStringExtra(PayPalActivity.EXTRA_PAY_KEY);
//                    Log.d("pavan", "success "+payKey);
//
//                    Toast.makeText(getApplicationContext(), "Payment done succesfully ", Toast.LENGTH_LONG).show();
//
//
//                    break;
//                case Activity.RESULT_CANCELED:
//                    Toast.makeText(getApplicationContext(), "Payment Canceled , Try again ", Toast.LENGTH_LONG).show();
//
//
//                    break;
//                case PayPalActivity.RESULT_FAILURE:
//                    Toast.makeText(getApplicationContext(), "Payment failed , Try again ", Toast.LENGTH_LONG).show();
//
//
//                    break;
//            }
//
//
//
//        }

    }





}