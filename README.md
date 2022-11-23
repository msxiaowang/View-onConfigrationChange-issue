# View-onConfigrationChange-issue
Sometimes View.onConfigurationChanged() is not called on orientation changes
Repro steps:
1. Click the "SHOW DIALOGFRAGMENT" button
2. switch screen between landscape and portrait mode several times
3. Oberserved the text in dialog fragment does not align with current orientation
![](https://github.com/msxiaowang/View-onConfigrationChange-issue/raw/main/assert/Screenshot_20221123_183923.png=250x)