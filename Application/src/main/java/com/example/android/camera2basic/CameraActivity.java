/*
 * Copyright 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.camera2basic;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);


        Button btn = (Button) findViewById(R.id.jump);
        btn.setOnClickListener(new MyListener());




//        if (null == savedInstanceState) {
//            getFragmentManager().beginTransaction()
//                    .replace(R.id.container, Camera2BasicFragment.newInstance())
//                    .commit();
//        }

    }


    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v){

            getFragmentManager().beginTransaction().replace(R.id.container,Camera2BasicFragment.newInstance()).commit();
            
        }
    }







}
