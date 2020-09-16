package behavioral.iterator.model;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    ChannelIterator iterator(ChannelTypeEnum channelTypeEnum);
}
