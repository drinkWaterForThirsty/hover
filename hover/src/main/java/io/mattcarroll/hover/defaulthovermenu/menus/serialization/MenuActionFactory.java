/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mattcarroll.hover.defaulthovermenu.menus.serialization;

import android.support.annotation.NonNull;

import io.mattcarroll.hover.defaulthovermenu.menus.Menu;
import io.mattcarroll.hover.defaulthovermenu.menus.MenuAction;

/**
 * Creates {@link MenuAction}s given various action IDs.
 */
public interface MenuActionFactory {

    MenuAction createShowSubmenuMenuAction(@NonNull Menu menu);

    MenuAction createMenuActionForId(@NonNull String actionId);

}
