package net.samagames.tsbot.channels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rigner for project SamaBot.
 */
public class ChannelManager
{
    private static int ids = 0;
    private List<BotChannel> channelList;

    public ChannelManager()
    {
        this.channelList = new ArrayList<>();
    }

    public List<BotChannel> getChannelList()
    {
        return channelList;
    }

    public BotChannel getChannel(int id)
    {
        return channelList.stream().filter(botChannel -> botChannel.getId() == id).findFirst().orElse(null);
    }

    public void addChannel(BotChannel botChannel)
    {
        this.channelList.add(botChannel);
    }

    public void removeChannel(BotChannel botChannel)
    {
        this.channelList.remove(botChannel);
    }

    public BotChannel createChannel(int realid)
    {
        BotChannel botChannel = new BotChannel(ids++, realid);
        this.channelList.add(botChannel);
        return botChannel;
    }
}