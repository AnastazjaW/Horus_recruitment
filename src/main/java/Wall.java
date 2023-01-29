import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private final CompositeBlock compositeBlock;

    public Wall(CompositeBlock compositeBlock) {
        this.compositeBlock = compositeBlock;
    }

    /**
     * Returns an Optional with Block with given colour.
     * @param color Color passed by user.
     * @return Optional with a value of Block with matching colour property. If no such Block with be found empty Optional object.
     */
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlock.getBlocks().stream().filter(block -> block.getColor().equals(color)).findAny();
    }

    /**
     * Returns a list of Blocks with given material.
     * @param material Material passed by user.
     * @return List of Blocks with matching material property.
     */
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return compositeBlock.getBlocks().stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
    }

    /**
     * Method counts number of Blocks in list.
     * @return number of Blocks in the CompositeBlock.
     */
    @Override
    public int count() {
        return compositeBlock.getBlocks().size();
    }
}
