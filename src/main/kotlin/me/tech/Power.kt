package me.tech

import com.github.shynixn.mccoroutine.velocity.SuspendingPluginContainer
import com.github.shynixn.mccoroutine.velocity.registerSuspend
import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.PluginContainer
import com.velocitypowered.api.proxy.ProxyServer
import net.kyori.adventure.text.minimessage.MiniMessage
import org.slf4j.Logger

@Plugin(
    id = "power",
    name = "power",
    version = "1.0.0",
    authors = ["Tech"]
)
class Power @Inject constructor(
    val proxy: ProxyServer,
    val pluginContainer: PluginContainer,
    val logger: Logger,
    suspendingPluginContainer: SuspendingPluginContainer
) {
    init {
        suspendingPluginContainer.initialize(this)
    }

    @Subscribe
    fun onProxyInitialization(ev: ProxyInitializeEvent) {
//        proxy.eventManager.registerSuspend(this, PlayerChooseInitialServerListener(proxy))
    }
}

val mm = MiniMessage.builder()
    .build()