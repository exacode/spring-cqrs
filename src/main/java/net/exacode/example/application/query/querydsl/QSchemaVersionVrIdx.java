package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSchemaVersionVrIdx is a Querydsl query type for QSchemaVersionVrIdx
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemaVersionVrIdx extends com.mysema.query.sql.RelationalPathBase<QSchemaVersionVrIdx> {

    private static final long serialVersionUID = 2106668526;

    public static final QSchemaVersionVrIdx schemaVersionVrIdx = new QSchemaVersionVrIdx("schema_version_vr_idx");

    public final NumberPath<Integer> versionRank = createNumber("version_rank", Integer.class);

    public QSchemaVersionVrIdx(String variable) {
        super(QSchemaVersionVrIdx.class, forVariable(variable), "public", "schema_version_vr_idx");
    }

    @SuppressWarnings("all")
    public QSchemaVersionVrIdx(Path<? extends QSchemaVersionVrIdx> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "schema_version_vr_idx");
    }

    public QSchemaVersionVrIdx(PathMetadata<?> metadata) {
        super(QSchemaVersionVrIdx.class, metadata, "public", "schema_version_vr_idx");
    }

}

