describe('MXPlayer', () => {
    it('Tests', async () => {
        
        await $("~Search").click();
        await $('//android.widget.EditText[@resource-id="com.mxtech.videoplayer.ad:id/search_src_text"]').setValue("Movies");
        await driver.pressKeyCode(66);
        const text = await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/search_no_result_tv")').getText();
        expect(text).toEqual("No results found");
        await $("~Navigate up").click();

        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Folders"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Files"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="All folders"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Grid"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="List"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Date"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Played time"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Status"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Length"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Size"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Resolution"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Path"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Frame rate"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $("~View Menu").click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_choice" and @text="Type"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
    });

    it('Tests1', async () => {

        await $("~View Menu").click();
        await $('(//android.view.View[@resource-id="com.mxtech.videoplayer.ad:id/view_fields"])[1]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Thumbnail"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Length"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="File extension"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Played time"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Resolution"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Frame rate"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Path"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Size"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Date"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Thumbnail"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Length"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="File extension"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Played time"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Resolution"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Frame rate"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Path"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Size"]').click();
        await $('//android.widget.CheckBox[@resource-id="com.mxtech.videoplayer.ad:id/tv_checkbox" and @text="Date"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();

        await $("~View Menu").click();
        await $('(//android.view.View[@resource-id="com.mxtech.videoplayer.ad:id/view_fields"])[2]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(0)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(2)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(0)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(1)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(2)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/deactivated_track").instance(1)').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();

    });

    it('Tests2', async () => {
        
        await $('//androidx.recyclerview.widget.RecyclerView[@resource-id="com.mxtech.videoplayer.ad:id/tiles_list"]/androidx.appcompat.widget.LinearLayoutCompat[1]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/fab_add")').click();
        await driver.pressKeyCode(4);
        await $("~Navigate up").click();

        await $('android=new UiSelector().className("androidx.appcompat.widget.LinearLayoutCompat").instance(2)').click();
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad.tr:id/send"]').click();
        const text1 = await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad.tr:id/toolbar_title"]').getText();
        expect(text1).toEqual("Select Files To Share");
        await driver.pressKeyCode(4);
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad.tr:id/receive"]').click();
        const text2 = await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad.tr:id/mxshare_desc")').getText();
        expect(text2).toEqual("Let's Set it Up");
        await driver.pressKeyCode(4);
        await $('//android.widget.FrameLayout[@resource-id="com.mxtech.videoplayer.ad.tr:id/connect_pc"]/android.widget.RelativeLayout').click();
        const text3 = await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad.tr:id/mxshare_desc"]').getText();
        expect(text3).toEqual("Let's Set it Up");
        await driver.pressKeyCode(4);
        await $('//android.widget.FrameLayout[@resource-id="com.mxtech.videoplayer.ad.tr:id/history"]/android.widget.RelativeLayout').click();
        const text4 = await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad.tr:id/mxshare_title"]').getText();
        expect(text4).toEqual("History");
        await driver.pressKeyCode(4);
        await $('android=new UiSelector().className("android.widget.ImageButton")').click();

    });

    it('Tests3', async () => {
        
        await $('android=new UiSelector().className("androidx.appcompat.widget.LinearLayoutCompat").instance(3)').click();
        await $('//androidx.recyclerview.widget.RecyclerView[@resource-id="com.mxtech.videoplayer.ad:id/recycler_view"]/android.view.ViewGroup').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/edit")').setValue("Hirak's Playlist");
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_create"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_add_video")').click();
        await $('//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/close_img"]').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/iv_more")').click();
        await $('//androidx.recyclerview.widget.RecyclerView[@resource-id="com.mxtech.videoplayer.ad:id/list"]/android.view.ViewGroup[3]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_ok")').click();
        await $('//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/close_img"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/btn_cancel")').click();

    });

    it('Test4', async () => {
        
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad:id/music_tab"]').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(4)').click();
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad:id/title_container"]/android.widget.FrameLayout[3]/android.view.ViewGroup').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(6)').click();
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad:id/title_container"]/android.widget.FrameLayout[5]/android.view.ViewGroup').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/iv_menu_more")').click();
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/add_to_home_screen"]').click();
        await $('//android.widget.Button[@text="CANCEL"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_change")').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/local_tab")').click();

    });

    it('Test5', async () => {
        
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/download_tab")').click();
        await $('~Download').click();
        await $('~Navigate up').click();
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/home_link_bg"])[1]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/rb_whats_app_business")').click();
        await $('//android.widget.RadioButton[@resource-id="com.mxtech.videoplayer.ad:id/rb_whats_app"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/tv_done")').click();
        await $('~Navigate up').click();
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/home_link_bg"])[2]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/iv_close")').click();
        await $('//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/iv_back"]').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/home_link_item_logo").instance(2)').click();
        await $('~Navigate up').click();
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/home_link_item_logo"])[8]').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/local_tab")').click();

    });

    it('Test6', async () => {
        
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad:id/me_tab"]').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(4)').click();
        await $('~Navigate up').click();
        await $('//androidx.recyclerview.widget.RecyclerView[@resource-id="com.mxtech.videoplayer.ad:id/rv_base_function"]/android.view.ViewGroup[2]').click();
        await $('android=new UiSelector().className("android.widget.ImageButton")').click();
        await $('//androidx.recyclerview.widget.RecyclerView[@resource-id="com.mxtech.videoplayer.ad:id/rv_base_function"]/android.view.ViewGroup[3]').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(7)').click();
        await $('//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/close_img"]').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(8)').click();
        await $('//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/iv_back"]').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(9)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(10)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.view.ViewGroup").instance(11)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/app_theme")').click();
        await $('//android.widget.FrameLayout[@resource-id="com.mxtech.videoplayer.ad:id/theme_list_dark_mode"]/android.widget.ImageView').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/app_theme")').click();
        await $('//android.widget.FrameLayout[@resource-id="com.mxtech.videoplayer.ad:id/theme_list_system_mode"]/android.widget.ImageView').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/settings")').click();
        await $('//android.widget.ListView[@resource-id="android:id/list"]/android.widget.LinearLayout[1]').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(6)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(7)').click();
        

    });

    it('Test7', async () => {
        
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(8)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(9)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(10)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(11)').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().className("android.widget.LinearLayout").instance(12)').click();
        await $('//android.widget.Button[@resource-id="android:id/button2"]').click();
        await $('//android.widget.ImageButton').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/custom_pip_control")').click();
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/video_select"])[2]').click();
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/video_select"])[1]').click();
        await $('~Navigate up').click();
        await $('android=new UiSelector().resourceId("com.mxtech.videoplayer.ad:id/local_tab")').click();

    });

    it('Test8', async () => {
        
        await driver.activateApp("io.appium.android.apis");
        await driver.pause(5000);
        await driver.activateApp("com.mxtech.videoplayer.ad");
        await driver.pressKeyCode(3);
        driver.openNotifications();
        await $('~Clear all notifications.').click();
    });

});