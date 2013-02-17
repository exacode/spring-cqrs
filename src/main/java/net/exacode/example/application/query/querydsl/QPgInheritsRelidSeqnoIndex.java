package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgInheritsRelidSeqnoIndex is a Querydsl query type for QPgInheritsRelidSeqnoIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgInheritsRelidSeqnoIndex extends com.mysema.query.sql.RelationalPathBase<QPgInheritsRelidSeqnoIndex> {

    private static final long serialVersionUID = -1565393613;

    public static final QPgInheritsRelidSeqnoIndex pgInheritsRelidSeqnoIndex = new QPgInheritsRelidSeqnoIndex("pg_inherits_relid_seqno_index");

    public final NumberPath<Long> inhrelid = createNumber("inhrelid", Long.class);

    public final NumberPath<Integer> inhseqno = createNumber("inhseqno", Integer.class);

    public QPgInheritsRelidSeqnoIndex(String variable) {
        super(QPgInheritsRelidSeqnoIndex.class, forVariable(variable), "pg_catalog", "pg_inherits_relid_seqno_index");
    }

    @SuppressWarnings("all")
    public QPgInheritsRelidSeqnoIndex(Path<? extends QPgInheritsRelidSeqnoIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_inherits_relid_seqno_index");
    }

    public QPgInheritsRelidSeqnoIndex(PathMetadata<?> metadata) {
        super(QPgInheritsRelidSeqnoIndex.class, metadata, "pg_catalog", "pg_inherits_relid_seqno_index");
    }

}

