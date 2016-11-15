package com.hongik.alpha_money.Activity;

/**
 * Created by jeon3029 on 16. 11. 15..
 */
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.hongik.alpha_money.R;

public class AboutDialog extends Dialog {

    private static final String INFO_HTML =
            "Copyright (C) 2016 Jeon Tae Joon, Lee Hee Jung<br>" +
                    "<a href=\"https://github.com/jeon3029/alpha_money_client\">https://github.com/jeon3029/alpha_money_client</a><br><br>" ;
                    //"Icons created by <a href=\"http://www.visualpharm.com\">VisualPharm</a>, " +
                    //"used under a <a href=\"http://creativecommons.org/licenses/by-nd/3.0/\">CC BY-ND 3.0</a> license.";
    private static final String LICENSE_HTML =
            "Licensed under the Apache License, Version 2.0 (the \"License\"). " +
                    "You may not use this program except in compliance with the License.<br>" +
                    "You may obtain a copy of the License at " +
                    "<a href=\"http://www.apache.org/licenses/LICENSE-2.0\">http://www.apache.org/licenses/LICENSE-2.0</a><br><br>"+
                    "<a href=\"taejjeon@gmail.com\">Contact : Tae Joon taejjeon@gmail.com</a><br>" +
                    "<a href=\"irr6864@naver.com\">Contact : Hee Jung irr6864@naver.com</a><br>" +
                    "<a href=\"http://www.hongik.ac.kr/index.do\">Hongik University.</a>" +
                    "  All rights reserved."+
                    "</a><br>";


    public AboutDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_dialog);
        setTitle(R.string.app_name);

        TextView info = (TextView) findViewById(R.id.about_info);
        info.setText(Html.fromHtml(INFO_HTML));
        info.setMovementMethod(LinkMovementMethod.getInstance());

        TextView license = (TextView) findViewById(R.id.about_license);
        license.setText(Html.fromHtml(LICENSE_HTML));
        license.setMovementMethod(LinkMovementMethod.getInstance());
    }

}