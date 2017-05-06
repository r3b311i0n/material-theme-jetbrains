package com.chrisrm.idea.ui;

import com.intellij.openapi.wm.WelcomeScreen;
import com.intellij.openapi.wm.WelcomeScreenProvider;
import com.intellij.ui.BalloonLayout;
import com.intellij.ui.Gray;
import com.intellij.ui.JBColor;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class MTFlatWelcomeScreenProvider implements WelcomeScreenProvider {
    private BalloonLayout myBalloonLayout;

    @SuppressWarnings("MethodOverridesStaticMethodOfSuperclass")
    public static Color getMainBackground() {
        return new JBColor(0x263238, 0x263238);
    }

    public static Color getProjectsBackground() {
        return new JBColor(0x263238, 0x263238);
    }

    public static Color getLinkNormalColor() {
        return new JBColor(Gray._0, Gray.xBB);
    }

    public static Color getListSelectionColor(boolean hasFocus) {
        return hasFocus ? new JBColor(0x3875d6, 0x4b6eaf) : new JBColor(Gray.xDD, Gray.x45);
    }

    public static Color getActionLinkSelectionColor() {
        return new JBColor(0xdbe5f5, 0x485875);
    }

    public static JBColor getSeparatorColor() {
        return new JBColor(Gray._0, Gray._0);
    }

    @Nullable
    @Override
    public WelcomeScreen createWelcomeScreen(JRootPane rootPane) {
        return new MTFlatWelcomeScreen();
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    private class MTFlatWelcomeScreen implements WelcomeScreen {
        @Override
        public JComponent getWelcomePanel() {
            return null;
        }

        @Override
        public void setupFrame(JFrame frame) {

        }

        @Override
        public void dispose() {

        }
    }
}
