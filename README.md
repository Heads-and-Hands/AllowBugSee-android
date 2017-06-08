# AllowBugSeeAndroid
Приложение установив которое, можно разрешить использование BugSee в приложение HandH.
Скачать apk можно в нашем HockeyApp [тут](https://rink.hockeyapp.net/apps/443e3d7a0c5d4d05a57d0c364a82b278)

В своем проекте добавь в манифест
```
<uses-permission android:name="allowbugsee.handh.ru.allowbugsee.ABSContentProvider.permRead" />
```

В проекте в MainActivity пример проверки, которую нужно использовать в проекте при подключении BugSee

```
// Kotlin check example
val bugSeeEnable = KotlinBugseeCheck(this)

// Java check example
Boolean bugSeeEnable = JavaBugSeeCheck.check(this);
```
