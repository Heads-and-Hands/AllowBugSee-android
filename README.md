# AllowBugSeeAndroid

Приложение установив которое, можно разрешить использование BugSee в приложении HandH.

Скачать apk можно в нашем HockeyApp [тут](https://rink.hockeyapp.net/apps/443e3d7a0c5d4d05a57d0c364a82b278)

В своем проекте добавь в Application

```
 if (BuildConfig.BUILD_TYPE.equals(Constants.INTERNAL) && JavaBagseeCheck.check(this)) {
            //внутренние  билды
            Bugsee.launch(this, "bugsee_key");
        } 
```

В данный момент работает только Java класс
