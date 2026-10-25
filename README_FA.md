# پروژهٔ آمادهٔ اندروید برای GitHub

این مخزن شامل سورس یک برنامهٔ نمونهٔ اندروید با رابط سادهٔ فارسی است. workflow موجود در GitHub Actions با هر push یا pull request اجرا می‌شود و APK نسخهٔ debug می‌سازد.

## دریافت APK از GitHub
1. این پوشه را در یک مخزن GitHub آپلود کنید.
2. به بخش **Actions** بروید و اجرای workflow با نام **Build Android APK** را باز کنید.
3. در بخش **Artifacts** فایل `AndroidStarter-debug-apk` را دانلود کنید. APK داخل آن در مسیر `app/build/outputs/apk/debug/` ساخته می‌شود.

## اجرای محلی
پروژه را در Android Studio باز و Sync کنید؛ یا با JDK 17 و Gradle 8.7 و Android SDK 35 اجرا کنید:

```sh
gradle assembleDebug
```

این بسته سورس پروژه است و APK از پیش‌کامپایل‌شده ندارد. برای ساخت APK آماده، workflow باید یک‌بار در GitHub اجرا شود. برنامهٔ نمونه فعلی صفحهٔ معرفی ساده دارد و هنوز ویژگی اختصاصی دیگری ندارد.
