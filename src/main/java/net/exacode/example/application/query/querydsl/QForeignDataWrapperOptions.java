package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignDataWrapperOptions is a Querydsl query type for QForeignDataWrapperOptions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignDataWrapperOptions extends com.mysema.query.sql.RelationalPathBase<QForeignDataWrapperOptions> {

    private static final long serialVersionUID = -1886957819;

    public static final QForeignDataWrapperOptions foreignDataWrapperOptions = new QForeignDataWrapperOptions("foreign_data_wrapper_options");

    public final SimplePath<Object> foreignDataWrapperCatalog = createSimple("foreign_data_wrapper_catalog", Object.class);

    public final SimplePath<Object> foreignDataWrapperName = createSimple("foreign_data_wrapper_name", Object.class);

    public final SimplePath<Object> optionName = createSimple("option_name", Object.class);

    public final SimplePath<Object> optionValue = createSimple("option_value", Object.class);

    public QForeignDataWrapperOptions(String variable) {
        super(QForeignDataWrapperOptions.class, forVariable(variable), "information_schema", "foreign_data_wrapper_options");
    }

    @SuppressWarnings("all")
    public QForeignDataWrapperOptions(Path<? extends QForeignDataWrapperOptions> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_data_wrapper_options");
    }

    public QForeignDataWrapperOptions(PathMetadata<?> metadata) {
        super(QForeignDataWrapperOptions.class, metadata, "information_schema", "foreign_data_wrapper_options");
    }

}

