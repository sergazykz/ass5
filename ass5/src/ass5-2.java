class Data {
    private String type;
    private Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
abstract class DataProcessor {
    public abstract void process(Data data);
}
class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing text data: " + data.getContent());
    }
}

class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing audio data.");
    }
}

class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing video data.");
    }
}
class TextContent {
    private String text;
    public TextContent(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}

class AudioContent {
    private byte[] audioBytes;
    public AudioContent(byte[] audioBytes) {
        this.audioBytes = audioBytes;
    }
    public byte[] getAudioBytes() {
        return audioBytes;
    }
    public void setAudioBytes(byte[] audioBytes) {
        this.audioBytes = audioBytes;
    }
}

class VideoContent {
    private byte[] videoBytes;
    public VideoContent(byte[] videoBytes) {
        this.videoBytes = videoBytes;
    }
    public byte[] getVideoBytes() {
        return videoBytes;
    }
    public void setVideoBytes(byte[] videoBytes) {
        this.videoBytes = videoBytes;
    }
}
class DataProcessorCreator {
    private DataProcessor processor;
    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }
    public void processData(Data data) {
        processor.process(data);
    }
}




