/*
 * Copyright (c) 2017-present, Red Brick Lane Marketing Solutions Pvt. Ltd.
 * All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package in.zapr.druid.druidry.dimension;

import com.fasterxml.jackson.annotation.JsonInclude;

import in.zapr.druid.druidry.dimension.enums.OutputType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper = true)
public class DefaultDimension extends DimensionSpec {

    private static final String DEFAULT_TYPE = "default";

    @Builder
    public DefaultDimension(@NonNull String dimension, @NonNull String outputName,
                            OutputType outputType) {
        this.type = DefaultDimension.DEFAULT_TYPE;
        this.dimension = dimension;
        this.outputName = outputName;
        this.outputType = outputType;
    }
}
