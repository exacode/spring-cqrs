package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSchemaVersionIrIdx is a Querydsl query type for QSchemaVersionIrIdx
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemaVersionIrIdx extends com.mysema.query.sql.RelationalPathBase<QSchemaVersionIrIdx> {

    private static final long serialVersionUID = 2094662753;

    public static final QSchemaVersionIrIdx schemaVersionIrIdx = new QSchemaVersionIrIdx("schema_version_ir_idx");

    public final NumberPath<Integer> installedRank = createNumber("installed_rank", Integer.class);

    public QSchemaVersionIrIdx(String variable) {
        super(QSchemaVersionIrIdx.class, forVariable(variable), "public", "schema_version_ir_idx");
    }

    @SuppressWarnings("all")
    public QSchemaVersionIrIdx(Path<? extends QSchemaVersionIrIdx> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "schema_version_ir_idx");
    }

    public QSchemaVersionIrIdx(PathMetadata<?> metadata) {
        super(QSchemaVersionIrIdx.class, metadata, "public", "schema_version_ir_idx");
    }

}

