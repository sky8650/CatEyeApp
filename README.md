# CatEyeApp
MVVM + Dagger 2 + RxJava + Retrofit2+Okhttp仿猫眼电影





##### 遇到的坑
 * 导入lib时记得在setting.gradle设置include ':app', ':mvvmlib'
 * 主项目的build中记得添加 dataBinding {  enabled true }否则可能导致生成不了对应的Binding文件
 * 布局文件的根变成layout标签，而且要小写
      
   
