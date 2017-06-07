# AllowBugSeeAndroid
Приложение установив которое, можно разрешить использование BugSee в приложение HandH

В папке sample лежат примеры проверок для разных языков

// Kotlin check example
```kotlin
val bugSeeEnable = KotlinBugSeeCheck(this)
```
// Java check example
```java
Boolean bugSeeEnable = JavaBugSeeCheck.check(this);
```
**НЕ ЗАБУДЬ добавить `<uses-permission android:name="ru.handh.abs.READ"/>` в манифест своего приложения, иначе при попытке проверки будет вылетать исключение!**