package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSchemaVersionSIdx is a Querydsl query type for QSchemaVersionSIdx
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemaVersionSIdx extends com.mysema.query.sql.RelationalPathBase<QSchemaVersionSIdx> {

    private static final long serialVersionUID = 760565789;

    public static final QSchemaVersionSIdx schemaVersionSIdx = new QSchemaVersionSIdx("schema_version_s_idx");

    public final BooleanPath success = createBoolean("success");

    public QSchemaVersionSIdx(String variable) {
        super(QSchemaVersionSIdx.class, forVariable(variable), "public", "schema_version_s_idx");
    }

    @SuppressWarnings("all")
    public QSchemaVersionSIdx(Path<? extends QSchemaVersionSIdx> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "schema_version_s_idx");
    }

    public QSchemaVersionSIdx(PathMetadata<?> metadata) {
        super(QSchemaVersionSIdx.class, metadata, "public", "schema_version_s_idx");
    }

}

