package com.fizzware.dramaticdoors.entity.ai.goal;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.VillagerProfession;

public class DDVillagerTasks
{
    public static ImmutableList<Pair<Integer, ? extends Task<? super VillagerEntity>>> createTallDoorTasks(VillagerProfession profession, float speed) {
        return ImmutableList.of(Pair.of(0, OpenTallDoorsTask.create()));
    }
}
