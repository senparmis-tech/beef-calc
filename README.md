# Receipt Book

## Option A - Install as an app (easiest, Android + iOS, no app store)
1. Upload the `www` folder to any free HTTPS host:
   - Netlify Drop: drag the `www` folder onto https://app.netlify.com/drop
   - or GitHub Pages / Cloudflare Pages / Vercel
2. Open the link on the phone:
   - Android (Chrome): menu > Install app / Add to Home screen
   - iPhone (Safari): Share > Add to Home Screen
It then opens full screen with its own icon and works offline.

## Option B - Real APK / iOS app (Capacitor)
Needs Node.js. Android needs Android Studio; iOS needs a Mac with Xcode.
    npm install
    npx cap add android
    npx cap add ios
    npx cap sync
    npx cap open android    # Build > Build APK(s)
    npx cap open ios        # Run / Archive in Xcode
Publishing: Google Play needs a developer account; the App Store needs an Apple Developer account.

Note: data is stored on each device (localStorage), not synced between phones.
