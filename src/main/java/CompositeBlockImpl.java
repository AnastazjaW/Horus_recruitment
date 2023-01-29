import java.util.List;

public class CompositeBlockImpl implements CompositeBlock{

    private List<Block> blocks;

    public CompositeBlockImpl(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }


    public String getColor() {
        return null;
    }

    @Override
    public String getMaterial() {
        return null;
    }
}
