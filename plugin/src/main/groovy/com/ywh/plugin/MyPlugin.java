package com.ywh.plugin;

import android.util.Log;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

public class MyPlugin  implements Plugin<Project> {
    // 当插件apply时调用
    @Override
    public void apply(Project project) {
        System.out.println("--------apply MyPlugin---------");

    }
}
