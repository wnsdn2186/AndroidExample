package com.example.tedpermission

import android.content.pm.PackageManager
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestPermission()
    }

    private fun requestPermission() {
        TedPermission.create()
            .setPermissionListener(object : PermissionListener {

                //권한이 허용됐을 때
                override fun onPermissionGranted() {
                    startProcess()
                }

                //권한이 거부됐을 때
                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(this@MainActivity, "카메라 기능 실행", Toast.LENGTH_SHORT).show()
                }
            })
            .setRationaleMessage("카메라 권한이 필요합니다.")
            .setDeniedMessage("카메라 권한을 허용해주세요.")// 권한이 없을 때 띄워주는 Message
            .setPermissions(android.Manifest.permission.CAMERA)
            .check()
    }

    // 카메라 기능 실행
    fun startProcess() {
        Toast.makeText(this, "카메라 기능 실행", Toast.LENGTH_LONG).show()
    }
}