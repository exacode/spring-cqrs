package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConstraintContypidIndex is a Querydsl query type for QPgConstraintContypidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConstraintContypidIndex extends com.mysema.query.sql.RelationalPathBase<QPgConstraintContypidIndex> {

    private static final long serialVersionUID = -2039805450;

    public static final QPgConstraintContypidIndex pgConstraintContypidIndex = new QPgConstraintContypidIndex("pg_constraint_contypid_index");

    public final NumberPath<Long> contypid = createNumber("contypid", Long.class);

    public QPgConstraintContypidIndex(String variable) {
        super(QPgConstraintContypidIndex.class, forVariable(variable), "pg_catalog", "pg_constraint_contypid_index");
    }

    @SuppressWarnings("all")
    public QPgConstraintContypidIndex(Path<? extends QPgConstraintContypidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_constraint_contypid_index");
    }

    public QPgConstraintContypidIndex(PathMetadata<?> metadata) {
        super(QPgConstraintContypidIndex.class, metadata, "pg_catalog", "pg_constraint_contypid_index");
    }

}

