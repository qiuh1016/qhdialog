package com.qiuhong.librarydemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.qiuhong.qhlibrary.QHTabBarActivity;
import java.util.ArrayList;
import java.util.List;

public class TabDemoActivity extends QHTabBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected String[] initTabText() {
        return new String[] {"SOS", "位置", "消息", "好友"};
    }

    @Override
    protected int[] initTabNormalImages() {
        return new int[] {
                R.mipmap.tab_icon_chat_normal,
                R.mipmap.tab_icon_chat_normal,
                R.mipmap.tab_icon_chat_normal,
                R.mipmap.tab_icon_chat_normal,
                R.mipmap.tab_icon_chat_normal
        };
    }

    @Override
    protected int[] initTabFocusImages() {
        return new int[] {
                R.mipmap.tab_icon_chat_focus,
                R.mipmap.tab_icon_chat_focus,
                R.mipmap.tab_icon_chat_focus,
                R.mipmap.tab_icon_chat_focus,
                R.mipmap.tab_icon_chat_focus,
        };
    }

    @Override
    protected boolean setScrollEnable() {
        return true;
    }

    @Override
    protected List<Fragment> initFragments() {
        List<Fragment>  fragments = new ArrayList<>();
        fragments.add(BlankFragment.newInstance(1));
        fragments.add(BlankFragment.newInstance(2));
        fragments.add(BlankFragment.newInstance(3));
        fragments.add(BlankFragment.newInstance(4));
        return fragments;
    }

}
