/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.editor.completion;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.tang.intellij.lua.lang.LuaIcons;
import com.tang.intellij.lua.stubs.index.LuaClassIndex;

import java.util.Collection;

/**
 * LuaLookupElement
 * Created by TangZX on 2016/12/16.
 */
public class LuaLookupElement {
    public static void fillTypes(Project project, Collection<LookupElement> results) {
        Collection<String> collection = LuaClassIndex.getInstance().getAllKeys(project);
        collection.forEach(className -> {
            results.add(LookupElementBuilder.create(className).withIcon(LuaIcons.CLASS));
        });
    }
}
