import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private CompositeBlock compositeBlock;

    public Wall(CompositeBlock compositeBlock) {
        this.compositeBlock = compositeBlock;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlock.getBlocks().stream().filter(block -> block.getColor().equals(color)).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return compositeBlock.getBlocks().stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return compositeBlock.getBlocks().size();
    }
}
