package com.receiptbook.app;

import android.content.Context;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = getBridge().getWebView();
        webView.addJavascriptInterface(new PrintBridge(), "AndroidPrint");
    }

    // Lets the app's Print button open the Android print dialog
    // (choose a printer, or "Save as PDF").
    class PrintBridge {
        @JavascriptInterface
        public void print() {
            runOnUiThread(() -> {
                WebView w = getBridge().getWebView();
                PrintManager pm = (PrintManager) getSystemService(Context.PRINT_SERVICE);
                pm.print("Receipt", w.createPrintDocumentAdapter("Receipt"), new PrintAttributes.Builder().build());
            });
        }
    }
}
