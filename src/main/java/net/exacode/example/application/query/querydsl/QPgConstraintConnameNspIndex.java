package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConstraintConnameNspIndex is a Querydsl query type for QPgConstraintConnameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConstraintConnameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgConstraintConnameNspIndex> {

    private static final long serialVersionUID = 145006556;

    public static final QPgConstraintConnameNspIndex pgConstraintConnameNspIndex = new QPgConstraintConnameNspIndex("pg_constraint_conname_nsp_index");

    public final SimplePath<Object> conname = createSimple("conname", Object.class);

    public final NumberPath<Long> connamespace = createNumber("connamespace", Long.class);

    public QPgConstraintConnameNspIndex(String variable) {
        super(QPgConstraintConnameNspIndex.class, forVariable(variable), "pg_catalog", "pg_constraint_conname_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgConstraintConnameNspIndex(Path<? extends QPgConstraintConnameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_constraint_conname_nsp_index");
    }

    public QPgConstraintConnameNspIndex(PathMetadata<?> metadata) {
        super(QPgConstraintConnameNspIndex.class, metadata, "pg_catalog", "pg_constraint_conname_nsp_index");
    }

}

