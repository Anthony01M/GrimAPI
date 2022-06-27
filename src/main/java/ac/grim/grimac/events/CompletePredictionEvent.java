package ac.grim.grimac.events;

import ac.grim.grimac.GrimUser;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class CompletePredictionEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final GrimUser player;
    private final double offset;
    private boolean cancelled;

    public CompletePredictionEvent(GrimUser player, double offset) {
        super(true); // Async!
        this.player = player;
        this.offset = offset;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public GrimUser getPlayer() {
        return player;
    }

    public double getOffset() {
        return offset;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

}
