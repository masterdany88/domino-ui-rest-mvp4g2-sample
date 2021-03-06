package com.sample.dominouimvprestsample.client.ui.shell;

import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.IsShell;
import com.github.mvp4g.mvp4g2.core.ui.annotation.EventHandler;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
import com.sample.dominouimvprestsample.client.DominoUiMvpRestSampleEventBus;
import elemental2.dom.Element;

/**
 * Copyright (C) 2018 Frank Hossfeld <frank.hossfeld@googlemail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Presenter(
        viewClass = ShellView.class,
        viewInterface = IShellView.class
)
public class ShellPresenter extends AbstractPresenter<DominoUiMvpRestSampleEventBus, IShellView> implements IShellView.Presenter, IsShell<DominoUiMvpRestSampleEventBus, IShellView> {
    public ShellPresenter() {
    }

    public void onBeforeEvent(String eventName) {
    }

    @EventHandler
    public void onSetContent(Element widget) {
        view.setContent(widget);
    }

    @EventHandler
    public void onSetNavigation(Element widget) {
        view.setNavigation(widget);
    }

    @EventHandler
    public void onSetStatusBar(Element widget) {
        view.setStatusBar(widget);
    }

    @Override
    public void setShell() {
        view.show();
    }
}
