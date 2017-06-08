# AllowBugSeeAndroid
Приложение установив которое, можно разрешить использование BugSee в приложение HandH

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
