package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QInformationSchemaCatalogName is a Querydsl query type for QInformationSchemaCatalogName
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QInformationSchemaCatalogName extends com.mysema.query.sql.RelationalPathBase<QInformationSchemaCatalogName> {

    private static final long serialVersionUID = 30836315;

    public static final QInformationSchemaCatalogName informationSchemaCatalogName = new QInformationSchemaCatalogName("information_schema_catalog_name");

    public final SimplePath<Object> catalogName = createSimple("catalog_name", Object.class);

    public QInformationSchemaCatalogName(String variable) {
        super(QInformationSchemaCatalogName.class, forVariable(variable), "information_schema", "information_schema_catalog_name");
    }

    @SuppressWarnings("all")
    public QInformationSchemaCatalogName(Path<? extends QInformationSchemaCatalogName> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "information_schema_catalog_name");
    }

    public QInformationSchemaCatalogName(PathMetadata<?> metadata) {
        super(QInformationSchemaCatalogName.class, metadata, "information_schema", "information_schema_catalog_name");
    }

}

