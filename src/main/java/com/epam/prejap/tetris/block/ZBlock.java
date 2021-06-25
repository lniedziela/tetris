package com.epam.prejap.tetris.block;

/**
 * Z block implementation.
 *
 * @author Łukasz Niedziela
 * @see Block
 */
final class ZBlock extends Block {

    /**
     * Byte array represents "Z" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *      ##
     *       ##
     *  -------------------
     */
    private static final byte[][] IMAGE = {
            {1, 1, 0},
            {0, 1, 1}
    };

    public ZBlock() {
        super(IMAGE);
    }
}
