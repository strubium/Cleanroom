/*
 * Minecraft Forge
 * Copyright (c) 2016-2020.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.registries;

import net.minecraft.network.datasync.DataSerializer;

/**
 * Represents an entry in the Forge registry for data serializers.
 * This class wraps a {@link DataSerializer} object and provides methods to access it.
 *
 */
public final class DataSerializerEntry extends IForgeRegistryEntry.Impl<DataSerializerEntry>
{
    /**
     * The wrapped data serializer.
     */
    private final DataSerializer<?> serializer;

    /**
     * Constructs a new DataSerializerEntry with the given data serializer.
     *
     * @param serializer The data serializer to be wrapped.
     */
    public DataSerializerEntry(DataSerializer<?> serializer)
    {
        this.serializer = serializer;
    }

    /**
     * Returns the wrapped data serializer.
     *
     * @return The wrapped data serializer.
     */
    public DataSerializer<?> getSerializer()
    {
        return serializer;
    }
}
