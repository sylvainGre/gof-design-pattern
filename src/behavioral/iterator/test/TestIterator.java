package behavioral.iterator.test;

import behavioral.iterator.impl.*;
import behavioral.iterator.model.*;

public class TestIterator {
    public static void main(String[] args){
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()){
            Channel currentChannel = baseIterator.next();
            System.out.println(currentChannel.toString());
        }
        System.out.println("****** \n");

        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()){
            Channel currentChannel = englishIterator.next();
            System.out.println(currentChannel.toString());
        }
    }


    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}

