package com.llchyan.miuna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClientOption;
import com.llchyan.miuna.baidumap.LocationService;

public class MainActivity extends AppCompatActivity implements BDLocationListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationService locationService = LocationService.getInstance(this);
        LocationClientOption option = locationService.getDefaultLocationClientOption();
        option.setScanSpan(0);
        locationService.setLocationOption(option);
        locationService.registerListener(this);
        locationService.start();

    }

    @Override
    public void onReceiveLocation(BDLocation location)
    {
        if (null != location && location.getLocType() != BDLocation.TypeServerError)
        {
//            mAddressCurrent.setText(String.format("%s\t%s\t%s", location.getProvince(), location.getCity(), location.getDistrict()));
//            mAddressCurrent.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    EventBus.getDefault().post(new AddressEvent(mAddressCurrent.getText().toString()));
//                    finish();
//                }
//            });
            //            StringBuffer sb = new StringBuffer(256);
            //            sb.append("time : ");
            /**
             * 时间也可以使用systemClock.elapsedRealtime()方法 获取的是自从开机以来，每次回调的时间；
             * location.getTime() 是指服务端出本次结果的时间，如果位置不发生变化，则时间不变
             */
            //            sb.append(location.getTime());
            //            sb.append("\nerror code : ");
            //            sb.append(location.getLocType());
            //            sb.append("\nlatitude : ");
            //            sb.append(location.getLatitude());
            //            sb.append("\nlontitude : ");
            //            sb.append(location.getLongitude());
            //            sb.append("\nradius : ");
            //            sb.append(location.getRadius());
            //            sb.append("\nCountryCode : ");
            //            sb.append(location.getCountryCode());
            //            sb.append("\nCountry : ");
            //            sb.append(location.getCountry());
            //            sb.append("\ncitycode : ");
            //            sb.append(location.getCityCode());
            //            sb.append("\ncity : ");
            //            sb.append(location.getCity());
            //            sb.append("\nDistrict : ");
            //            sb.append(location.getDistrict());
            //            sb.append("\nStreet : ");
            //            sb.append(location.getStreet());
            //            sb.append("\naddr : ");
            //            sb.append(location.getAddrStr());
            //            sb.append("\nDescribe: ");
            //            sb.append(location.getLocationDescribe());
            //            sb.append("\nDirection(not all devices have value): ");
            //            sb.append(location.getDirection());
            //            sb.append("\nPoi: ");
            //            if (location.getPoiList() != null && !location.getPoiList().isEmpty())
            //            {
            //                for (int i = 0; i < location.getPoiList().size(); i++)
            //                {
            //                    Poi poi = (Poi) location.getPoiList().get(i);
            //                    sb.append(poi.getName() + ";");
            //                }
            //            }
            //            if (location.getLocType() == BDLocation.TypeGpsLocation)
            //            {// GPS定位结果
            //                sb.append("\nspeed : ");
            //                sb.append(location.getSpeed());// 单位：km/h
            //                sb.append("\nsatellite : ");
            //                sb.append(location.getSatelliteNumber());
            //                sb.append("\nheight : ");
            //                sb.append(location.getAltitude());// 单位：米
            //                sb.append("\ndescribe : ");
            //                sb.append("gps定位成功");
            //            } else if (location.getLocType() == BDLocation.TypeNetWorkLocation)
            //            {// 网络定位结果
            //                // 运营商信息
            //                sb.append("\noperationers : ");
            //                sb.append(location.getOperators());
            //                sb.append("\ndescribe : ");
            //                sb.append("网络定位成功");
            //            } else if (location.getLocType() == BDLocation.TypeOffLineLocation)
            //            {// 离线定位结果
            //                sb.append("\ndescribe : ");
            //                sb.append("离线定位成功，离线定位结果也是有效的");
            //            } else if (location.getLocType() == BDLocation.TypeServerError)
            //            {
            //                sb.append("\ndescribe : ");
            //                sb.append("服务端网络定位失败，可以反馈IMEI号和大体定位时间到loc-bugs@baidu.com，会有人追查原因");
            //            } else if (location.getLocType() == BDLocation.TypeNetWorkException)
            //            {
            //                sb.append("\ndescribe : ");
            //                sb.append("网络不同导致定位失败，请检查网络是否通畅");
            //            } else if (location.getLocType() == BDLocation.TypeCriteriaException)
            //            {
            //                sb.append("\ndescribe : ");
            //                sb.append("无法获取有效定位依据导致定位失败，一般是由于手机的原因，处于飞行模式下一般会造成这种结果，可以试着重启手机");
            //            }
            //            logMsg(sb.toString());
        }
    }
}
